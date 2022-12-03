/* komal */

CREATE SCHEMA `scd_project` ;


CREATE TABLE `scd_project`.`projects` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `deadline` DATETIME NULL,
  `description` VARCHAR(400) NULL,
  `progress` DOUBLE NULL DEFAULT 0,
  `project_manager` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
ALTER TABLE `scd_project`.`projects`
ADD CONSTRAINT `fk_projmanager`
FOREIGN KEY (`project_manager`) REFERENCES `scd_project`.`employees`(`username`) on update cascade on delete cascade;
  
INSERT INTO `scd_project`.`projects` (`id`, `title`, `deadline`, `description`) VALUES (NULL, 'Restaurant Management - McDonalds', '2023-02-12 00:00:00', 'This is a restaurant management project for McDonalds. It will include order placement, inventory management and billing.');
INSERT INTO `scd_project`.`projects` (`title`, `deadline`, `description`, `progress`) VALUES ('Pet Store Automation', '2022-12-31', 'Automation for purchasing pet food items/ pet accessories from pet stores.', '90');
INSERT INTO `scd_project`.`projects` (`title`, `deadline`, `description`, `progress`) VALUES ('Bubble Shooter Game', '2022-12-24', 'Making a simple bubble shooter game for children with unique features.', '75');
UPDATE `scd_project`.`projects` SET `project_manager` = 'komal3' WHERE (`id` = '1');
UPDATE `scd_project`.`projects` SET `project_manager` = 'nisa123' WHERE (`id` = '2');
UPDATE `scd_project`.`projects` SET `project_manager` = 'komal3' WHERE (`id` = '3');


  CREATE TABLE `scd_project`.`projectteam` (
  `project_id` INT NOT NULL,
  `username` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`project_id`, `username`),
  CONSTRAINT `team_project`
    FOREIGN KEY (`project_id`)
    REFERENCES `scd_project`.`projects` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
    
ALTER TABLE `scd_project`.`projectteam`
ADD CONSTRAINT `fk_teammember`
FOREIGN KEY (`username`) REFERENCES `scd_project`.`employees`(`username`) on update cascade on delete cascade;

INSERT INTO `scd_project`.`projectteam` (`project_id`, `username`) VALUES ('1', 'komal1');
INSERT INTO `scd_project`.`projectteam` (`project_id`, `username`) VALUES ('1', 'nabeeha1');
INSERT INTO `scd_project`.`projectteam` (`project_id`, `username`) VALUES ('2', 'komal23');
INSERT INTO `scd_project`.`projectteam` (`project_id`, `username`) VALUES ('2', 'nabeeha1');
INSERT INTO `scd_project`.`projectteam` (`project_id`, `username`) VALUES ('3', 'komal23');

    
CREATE TABLE `scd_project`.`tasks` (
  `task_id` INT NOT NULL AUTO_INCREMENT,
  `project_id` INT NOT NULL,
  `deadline` DATETIME NULL,
  `description` VARCHAR(400) NULL,
  `progress` DOUBLE NOT NULL DEFAULT 0,
  PRIMARY KEY (`task_id`, `project_id`),
  INDEX `fk_task_project_idx` (`project_id` ASC) VISIBLE,
  CONSTRAINT `fk_task_project`
    FOREIGN KEY (`project_id`)
    REFERENCES `scd_project`.`projects` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

INSERT INTO `scd_project`.`tasks` (`project_id`, `deadline`, `progress`) VALUES ('1', '2022-12-13', '50');
INSERT INTO `scd_project`.`tasks` (`project_id`, `deadline`, `progress`) VALUES ('2', '2022-12-18', '45');
INSERT INTO `scd_project`.`tasks` (`project_id`, `deadline`, `progress`) VALUES ('3', '2022-12-10', '70');
INSERT INTO `scd_project`.`tasks` (`project_id`, `deadline`) VALUES ('1', '2023-01-23');

/* nabeeha */

CREATE TABLE `scd_project`.`task_assignment` (
  `task_id` INT NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `proj_id` INT NOT NULL,
  PRIMARY KEY (`task_id`, `username`, `proj_id`),
  INDEX `proj_id_idx` (`proj_id` ASC) VISIBLE,
  CONSTRAINT `proj_id`
    FOREIGN KEY (`proj_id`)
    REFERENCES `scd_project`.`projects` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `task_id`
    FOREIGN KEY (`task_id`)
    REFERENCES `scd_project`.`tasks` (`task_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

ALTER TABLE `scd_project`.`task_assignment`
ADD CONSTRAINT `fk_assignedto`
FOREIGN KEY (`username`) REFERENCES `scd_project`.`employees`(`username`) on update cascade on delete cascade;

INSERT INTO `scd_project`.`task_assignment` (`task_id`, `username`, `proj_id`) VALUES ('1', 'nabeeha1', '1');
INSERT INTO `scd_project`.`task_assignment` (`task_id`, `username`, `proj_id`) VALUES ('2', 'komal1', '2');


CREATE TABLE `scd_project`.`noticeboard` (
  `msg_id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `projid` INT NOT NULL,
  `date` DATE NOT NULL,
  `text` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`msg_id`),
  CONSTRAINT FK_NOTICEBOARD FOREIGN KEY (projid)
    REFERENCES projects(id)
    on update cascade on delete cascade
);

ALTER TABLE `scd_project`.`noticeboard`
ADD CONSTRAINT `fk_user`
FOREIGN KEY (`username`) REFERENCES `scd_project`.`employees`(`username`) on update cascade on delete cascade;

ALTER TABLE `scd_project`.`noticeboard`
ADD CONSTRAINT `fk_projId`
FOREIGN KEY (`projid`) REFERENCES `scd_project`.`projects`(`id`) on update cascade on delete cascade;

INSERT INTO `scd_project`.`noticeboard` (`msg_id`, `username`, `projid`, `date`, `text`) VALUES ('1', 'komal23', '1', '2022-11-24', 'hello');
INSERT INTO `scd_project`.`noticeboard` (`msg_id`, `username`, `projid`, `date`, `text`) VALUES ('2', 'nabeeha123', '3', '2022-11-20', 'announcement!');
  
/* nisa */
  
CREATE TABLE `scd_project`.`employees` (
  `username` VARCHAR(100) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `salary` DOUBLE NULL DEFAULT 0,
  `designation` VARCHAR(100) NOT NULL, 
  PRIMARY KEY (`username`));
  
  
INSERT INTO `scd_project`.`employees` (`username`, `password`, `name`, `salary`,`designation`) VALUES ('nisa123', '123', 'Nisa', 40000,'Project Manager');
INSERT INTO `scd_project`.`employees` (`username`, `password`, `name`, `salary`,`designation`) VALUES ('komal23', '456', 'Komal', 8000,'Developer');
INSERT INTO `scd_project`.`employees` (`username`, `password`, `name`, `salary`,`designation`) VALUES ('nabeeha123', '789', 'Nabeeha', 30000,'HR');
INSERT INTO `scd_project`.`employees` (`username`, `password`, `name`, `salary`, `designation`) VALUES ('komal1', '000', 'Komal Waseem', '100000', 'Developer');
INSERT INTO `scd_project`.`employees` (`username`, `password`, `name`, `salary`, `designation`) VALUES ('nabeeha1', '111', 'Nabeeha', '12232', 'Developer');
INSERT INTO `scd_project`.`employees` (`username`, `password`, `name`, `salary`, `designation`) VALUES ('nisa2', '2323', 'Nisa', '1000000', 'CEO');
INSERT INTO `scd_project`.`employees` (`username`, `password`, `name`, `salary`, `designation`) VALUES ('komal3', '232', 'Komal', '123324', 'Project Manager');


CREATE TABLE `scd_project`.`application` (
  `name` VARCHAR(100) NOT NULL,
  `id` INT NOT NULL AUTO_INCREMENT,
  `contact` VARCHAR(100) NOT NULL,
  `degree` VARCHAR(100) NOT NULL,
  `institution` VARCHAR(100) NOT NULL,
  `cgpa` DOUBLE NULL,
  `experience` DOUBLE NULL,
  `skills` VARCHAR(100) NOT NULL, 
  
  PRIMARY KEY (`id`));
  
  
INSERT INTO `scd_project`.`application` (`name`, `id`, `contact`, `degree`,`institution`,`cgpa`, `experience`,`skills` ) VALUES ('nisa', 1, '03094283955','SE' ,'FAST',3.65,2,'courses done in AI ');
INSERT INTO `scd_project`.`application` (`name`, `id`, `contact`, `degree`,`institution`,`cgpa`, `experience`,`skills` ) VALUES ('nabeeha', 2, '03094283954','CS' ,'NUST',3.00,7,'courses done in AI ');
INSERT INTO `scd_project`.`application` (`name`, `id`, `contact`, `degree`,`institution`,`cgpa`, `experience`,`skills` ) VALUES ('komal', 3, '03094283957','CS' ,'FAST',2.98,9,'courses done in AI ');

CREATE TABLE `scd_project`.`attendance` (
  `status` boolean NOT NULL,
  `username` VARCHAR(100) NOT NULL,
  `overtime` INT NULL,
  `date`  DATE NOT NULL,
  
  PRIMARY KEY (`username`,`date`));

ALTER TABLE `scd_project`.`attendance`
ADD CONSTRAINT `fk_employeeatt`
FOREIGN KEY (`username`) REFERENCES `scd_project`.`employees`(`username`) on DELETE cascade on update cascade;
  
INSERT INTO `scd_project`.`attendance` (`status`, `username`, `overtime`, `date`) VALUES ( 1, 'nisa123', 4 ,'2022-08-22');
INSERT INTO `scd_project`.`attendance` (`status`, `username`, `overtime`, `date`) VALUES ( 0, 'komal23', 0 ,'2022-08-22');
INSERT INTO `scd_project`.`attendance` (`status`, `username`, `overtime`, `date`) VALUES ( 0, 'nabeeha123', 6 ,'2022-08-22');

/* updates */

INSERT INTO `scd_project`.`tasks` (`task_id`, `project_id`, `deadline`, `progress`) VALUES ('4', '3', '2022-12-01', '80');
INSERT INTO `scd_project`.`tasks` (`task_id`, `project_id`, `deadline`, `progress`) VALUES ('5', '3', '2022-12-22', '60');

UPDATE `scd_project`.`tasks` SET `description` = 'i am task 1' WHERE (`task_id` = '1') and (`project_id` = '1');
UPDATE `scd_project`.`tasks` SET `description` = 'do this' WHERE (`task_id` = '2') and (`project_id` = '2');
UPDATE `scd_project`.`tasks` SET `description` = 'do that' WHERE (`task_id` = '3') and (`project_id` = '3');
UPDATE `scd_project`.`tasks` SET `description` = 'i am task 4 ' WHERE (`task_id` = '4') and (`project_id` = '1');
UPDATE `scd_project`.`tasks` SET `description` = 'i am a task' WHERE (`task_id` = '4') and (`project_id` = '3');
UPDATE `scd_project`.`tasks` SET `description` = 'i am another task' WHERE (`task_id` = '5') and (`project_id` = '3');

ALTER TABLE `scd_project`.`noticeboard` 
ADD COLUMN `title` VARCHAR(45) NULL AFTER `text`;

UPDATE `scd_project`.`noticeboard` SET `text` = 'please extend deadline', `title` = 'Deadline Extension Request' WHERE (`msg_id` = '1');
UPDATE `scd_project`.`noticeboard` SET `title` = 'Announcement' WHERE (`msg_id` = '2');

INSERT INTO `scd_project`.`noticeboard` (`msg_id`, `username`, `projid`, `date`, `text`, `title`) VALUES ('3', 'nisa2', '2', '2022-11-26', 'Meeting tomorrow at 2:00 PM with clients.', 'Meeting Announcement');
INSERT INTO `scd_project`.`noticeboard` (`username`, `projid`, `date`, `text`, `title`) VALUES ('nisa2', '3', current_date, 'This is an announcement.', 'Announcement');

UPDATE `scd_project`.`attendance` SET `status` = '1' WHERE (`username` = 'nabeeha123') and (`date` = '2022-08-22');

ALTER TABLE `scd_project`.`noticeboard` 
CHANGE COLUMN `text` `text` VARCHAR(500) NOT NULL ;

