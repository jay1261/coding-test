SELECT ANIMAL_ID, Name
from ANIMAL_INS
where name like "%el%" and ANIMAL_TYPE like "Dog"
order by name;