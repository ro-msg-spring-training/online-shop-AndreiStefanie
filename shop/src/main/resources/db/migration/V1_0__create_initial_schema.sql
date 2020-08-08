create table if not exists suppliers (
    id int not null auto_increment primary key,
    name varchar(255)
);

create table if not exists product_categories (
    id int not null auto_increment primary key,
    name varchar(255),
    description varchar(2000)
);

create table if not exists products (
    id int not null auto_increment primary key,
    name varchar(255),
    description varchar(255),
    price bigint,
    currency varchar(3),
    weight double,
    category_id int,
    supplier_id int,
    image_url varchar(255),
    foreign key (category_id) references product_categories (id),
    foreign key (supplier_id) references suppliers (id)
);

create table if not exists locations (
    id int not null auto_increment primary key,
    name varchar(255),
    country varchar(255),
    city varchar(255),
    county varchar(255),
    street varchar(255)
);

create table if not exists stock (
    product_id int,
    location_id int,
    quantity int,
    primary key (product_id, location_id),
    foreign key (product_id) references products (id),
    foreign key (location_id) references locations (id)
);

create table if not exists customers (
    id int not null auto_increment primary key,
    first_name varchar(255),
    last_name varchar(255),
    username varchar(255),
    password varchar(255),
    email varchar(255)
);

create table if not exists orders (
    id int not null auto_increment primary key,
    shipped_from int,
    customer_id int,
    created_at timestamp,
    country varchar(255),
    city varchar(255),
    county varchar(255),
    street varchar(255),
    foreign key (shipped_from) references locations (id),
    foreign key (customer_id) references customers (id)
);

create table if not exists order_detail (
    order_id int,
    product_id int,
    quantity int,
    primary key (order_id, product_id),
    foreign key (order_id) references orders (id),
    foreign key (product_id) references products (id)
);

create table if not exists revenue (
    id int not null auto_increment primary key,
    location_id int,
    created_at timestamp,
    amount bigint,
    currency char(3),
    foreign key (location_id) references locations (id)
);
