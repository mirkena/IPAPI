INSERT INTO Country(country,country_Name) VALUES
 ('US', 'Unites States'),('CA', 'Canada');

insert into region values ('IA','Iowa','US');
insert into time_zone values ('America/Chicago','CDT','+3:00');
insert into city values ('Fairfield','IA','America/Chicago');


insert into ISP(isp,org,as) values (
  'Local Internet Service Company',
  'Local Internet Service Company',
  'AS12133 Local Internet Service Company');
insert into address(lat,lon,zip,city) values
(41.0014,-91.9578,'52556','Fairfield');

   insert into IPLocator(IP,Address_id,isp_isp_code) values
   ('76.76.236.24',1,1);