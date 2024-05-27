SELECT A.ANIMAL_ID, A.NAME
from ANIMAL_INS A left join ANIMAL_OUTS B on A.ANIMAL_ID=B.ANIMAL_ID
order by DATEDIFF(b.DATETIME,a.datetime) desc 
limit 2;
