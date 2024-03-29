# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table contact_details (
  telephone_number          varchar(255))
;

create table therapist (
  handle                    varchar(255) not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  email_address             varchar(255),
  constraint pk_therapist primary key (handle))
;

create sequence therapist_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists contact_details;

drop table if exists therapist;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists therapist_seq;

