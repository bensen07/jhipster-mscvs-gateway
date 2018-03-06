-- Drop Cities Table
ALTER TABLE cities DROP CONSTRAINT pk_city_id;
ALTER TABLE cities DROP CONSTRAINT fk_state_id;
DROP TABLE IF EXISTS cities;

-- Drop States Table
ALTER TABLE states DROP CONSTRAINT pk_state_id;
DROP TABLE IF EXISTS states;

-- Create States Table
CREATE TABLE states (
	id serial,
    name VARCHAR(100),
    population integer,
    CONSTRAINT pk_state_id PRIMARY KEY (id)
);

-- Create Cities Table
CREATE TABLE cities (
	id serial,
    name VARCHAR(100),
    state_id integer,
    population integer,
    CONSTRAINT pk_city_id PRIMARY KEY (id),
    CONSTRAINT fk_state_id FOREIGN KEY (state_id) REFERENCES states(id) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE CASCADE
);
