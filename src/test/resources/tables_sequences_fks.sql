-- Drop sequences if they exist
DROP SEQUENCE IF EXISTS seq_animal_id;
DROP SEQUENCE IF EXISTS seq_application_id;
DROP SEQUENCE IF EXISTS seq_city_id;
DROP SEQUENCE IF EXISTS seq_post_id;
DROP SEQUENCE IF EXISTS seq_product_id;
DROP SEQUENCE IF EXISTS seq_user_id;

-- Drop foreign key constraints
ALTER TABLE IF EXISTS application DROP CONSTRAINT IF EXISTS FKtbcejcatqctectw6hhwwbsv97;
ALTER TABLE IF EXISTS application DROP CONSTRAINT IF EXISTS FKldca8xj6lqb3rsqawrowmkqbg;
ALTER TABLE IF EXISTS post DROP CONSTRAINT IF EXISTS FK72mt33dhhs48hf9gcqrq4fxte;
ALTER TABLE IF EXISTS product DROP CONSTRAINT IF EXISTS FKmd07ty18fx2nuoehepwdsq43n;
ALTER TABLE IF EXISTS "user" DROP CONSTRAINT IF EXISTS FKrr9nem4390sls50t39fcuy1k6;

-- Drop tables with CASCADE
DROP TABLE IF EXISTS animal CASCADE;
DROP TABLE IF EXISTS application CASCADE;
DROP TABLE IF EXISTS city CASCADE;
DROP TABLE IF EXISTS post CASCADE;
DROP TABLE IF EXISTS product CASCADE;
DROP TABLE IF EXISTS "user" CASCADE;

create sequence seq_animal_id start with 1 increment by 1;
create sequence seq_application_id start with 1 increment by 1;
create sequence seq_city_id start with 1 increment by 1;
create sequence seq_post_id start with 1 increment by 1;
create sequence seq_product_id start with 1 increment by 1;
create sequence seq_user_id start with 1 increment by 1;
create table animal
(
    id   bigint not null,
    name varchar(255),
    primary key (id)
);
create table application
(
    is_active  boolean,
    apply_date timestamp(6),
    id         bigint not null,
    post_id    bigint not null,
    user_id    bigint not null,
    primary key (id)
);
create table city
(
    city_code bigint,
    id        bigint not null,
    city_name varchar(255),
    primary key (id)
);
create table post
(
    is_active    boolean,
    created_date timestamp(6),
    id           bigint not null,
    updated_date timestamp(6),
    user_id      bigint not null,
    description  varchar(255),
    title        varchar(255),
    primary key (id)
);
create table product
(
    animal_id bigint       not null,
    id        bigint       not null,
    name      varchar(255) not null,
    primary key (id)
);
create table "user"
(
    city_code  bigint not null,
    id         bigint not null,
    address    varchar(255),
    first_name varchar(255),
    last_name  varchar(255),
    password   varchar(255),
    user_name  varchar(255),
    primary key (id)
);
alter table if exists application add constraint application_post_fk foreign key (post_id) references post;
alter table if exists application add constraint application_user_fk foreign key (user_id) references "user";
alter table if exists post add constraint post_user_fk foreign key (user_id) references "user";
alter table if exists product add constraint product_animal_fk foreign key (animal_id) references animal;
alter table if exists "user" add constraint user_city_fk foreign key (city_code) references city;
