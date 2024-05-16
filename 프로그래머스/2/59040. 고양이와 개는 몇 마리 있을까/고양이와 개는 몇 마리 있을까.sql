SELECT ANIMAL_TYPE,
    count(*) as count
from ANIMAL_INS
group by 1
order by ANIMAL_TYPE;