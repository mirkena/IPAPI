package com.dropwizard.IPAPI.entity;

        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.Id;
        import javax.persistence.OneToMany;
        import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Continent {

    @Id
    private String continentCode;
    private String continentName;
    @OneToMany(mappedBy = "continent")
    private List<Country> countries;

}
