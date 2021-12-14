
drop table if exists `property` CASCADE;
create table `property`(`id` integer PRIMARY KEY AUTO_INCREMENT, 
`address` varchar(255) not null,
`gps_location` varchar(255) , 
`location` varchar(255) not null, 
`price` integer, 
`bedrooms` integer);