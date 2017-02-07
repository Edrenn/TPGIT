#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Create DATABASE and USER
#------------------------------------------------------------
CREATE DATABASE TPGit;
CREATE USER "tpgit"@"localhost" IDENTIFIED BY "pwd";

#------------------------------------------------------------
# Table: User
#------------------------------------------------------------

CREATE TABLE User(
        user_id     int (11) Auto_increment  NOT NULL ,
        user_nom    Varchar (25) ,
        user_prenom Varchar (25) ,
        user_login  Varchar (25) ,
        user_mdp    Varchar (25) ,
        PRIMARY KEY (user_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Droits
#------------------------------------------------------------

CREATE TABLE Droits(
        droits_id       int (11) Auto_increment  NOT NULL ,
        droits_niv      Int ,
        droits_severite Int ,
        droits_nom      Varchar (25) ,
        droits_societe  Varchar (25) ,
        PRIMARY KEY (droits_id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Possede
#------------------------------------------------------------

CREATE TABLE Possede(
        user_id   Int NOT NULL ,
        droits_id Int NOT NULL ,
        PRIMARY KEY (user_id ,droits_id )
)ENGINE=InnoDB;

ALTER TABLE Possede ADD CONSTRAINT FK_Possede_user_id FOREIGN KEY (user_id) REFERENCES User(user_id);
ALTER TABLE Possede ADD CONSTRAINT FK_Possede_droits_id FOREIGN KEY (droits_id) REFERENCES Droits(droits_id);

#------------------------------------------------------------
# USER RIGTHS
#------------------------------------------------------------

GRANT ALL ON TPGit.* TO "tpgit"@"localhost" IDENTIFIED BY "pwd";

