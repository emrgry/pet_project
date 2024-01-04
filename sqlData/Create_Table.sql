CREATE TABLE cities (
    city_code SERIAL PRIMARY KEY,
    city_name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE animal_type (
    animal_type_id SERIAL PRIMARY KEY,
    species VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE animals (
    animal_type_id INTEGER REFERENCES animal_type(animal_type_id) ON UPDATE CASCADE NOT NULL,
    animal_name VARCHAR(50) NOT NULL
);

CREATE TABLE user_table (
    username VARCHAR(50) PRIMARY KEY UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    address VARCHAR(255),
    city_code INTEGER REFERENCES cities(city_code) ON UPDATE CASCADE,
    animal_type_id INTEGER REFERENCES animal_type(animal_type_id) ON UPDATE CASCADE
);

CREATE TABLE advertisements (
    advertisements_id SERIAL PRIMARY KEY,
    username VARCHAR(50) REFERENCES user_table(username)  ON UPDATE CASCADE,
    animal_type_id INTEGER REFERENCES animal_type(animal_type_id)  ON UPDATE CASCADE NOT NULL,
    create_date TIMESTAMP NOT NULL DEFAULT NOW(),
    update_date TIMESTAMP,
    title VARCHAR(100) NOT NULL,
	description VARCHAR(100) NOT NULL,
    is_active BOOLEAN DEFAULT TRUE
);

CREATE TABLE applications (
	advertisements_id INTEGER REFERENCES advertisements(advertisements_id) ON UPDATE CASCADE,
    username VARCHAR(50) REFERENCES user_table(username)  ON UPDATE CASCADE NOT NULL,
    apply_date DATE NOT NULL,
    is_active BOOLEAN DEFAULT TRUE
);



CREATE TABLE toys (
    animal_type_id INTEGER REFERENCES animal_type(animal_type_id) ON UPDATE CASCADE NOT NULL,
    toy_name VARCHAR(50) NOT NULL,
    PRIMARY KEY (animal_type_id, toy_name)
);


