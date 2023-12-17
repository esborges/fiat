-- SCHEMA: curso

-- DROP SCHEMA IF EXISTS curso ;

CREATE SCHEMA IF NOT EXISTS curso
    AUTHORIZATION postgres;

COMMENT ON SCHEMA curso
    IS 'standard public schema';

GRANT ALL ON SCHEMA curso TO postgres;
