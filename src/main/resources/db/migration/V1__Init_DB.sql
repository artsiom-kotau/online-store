create sequence hibernate_sequence start 1 increment 1;
create table bucket_goods
(
    id              int8 not null,
    number_of_goods int4,
    price           numeric(19, 2),
    bucket_id       int8 not null,
    good_id         int8 not null,
    primary key (id)
);
create table buckets
(
    id int8 not null,
    primary key (id)
);
create table categories
(
    id      int8 not null,
    name    varchar(255),
    good_id int8 not null,
    primary key (id)
);
create table goods
(
    id      int8 not null,
    country varchar(255),
    name    varchar(255),
    primary key (id)
);
create table payment_methods
(
    id         int8 not null,
    profile_id int8 not null,
    primary key (id)
);
create table profiles
(
    id      int8 not null,
    user_id int8,
    primary key (id)
);
create table transactions
(
    id                int8 not null,
    date              timestamp,
    price             numeric(19, 2),
    good_id           int8 not null,
    payment_method_id int8 not null,
    primary key (id)
);
create table users
(
    id        int8 not null,
    bucket_id int8,
    primary key (id)
);
alter table if exists bucket_goods add constraint bucket_goods_buckets_fk foreign key (bucket_id) references buckets;
alter table if exists bucket_goods add constraint bucket_goods_goods_fk foreign key (good_id) references goods;
alter table if exists categories add constraint categories_goods_fk foreign key (good_id) references goods;
alter table if exists payment_methods add constraint payment_methods_profiles_fk foreign key (profile_id) references profiles;
alter table if exists profiles add constraint profiles_users_fk foreign key (user_id) references users;
alter table if exists transactions add constraint transactions_goods_fk foreign key (good_id) references goods;
alter table if exists transactions add constraint transactions_payment_methods_fk foreign key (payment_method_id) references payment_methods;
alter table if exists users add constraint users_bucket_fk foreign key (bucket_id) references buckets;
