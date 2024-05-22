SELECT A.NAME, A.DATETIME
from ANIMAL_INS A left join ANIMAL_OUTS B on A.ANIMAL_ID=B.ANIMAL_ID
where B.dateTIme is null
order by 2
limit 3
;