SELECT A.ANIMAL_ID, A.ANIMAL_TYPE, A.NAME		
from ANIMAL_INS A left join ANIMAL_OUTS B on A.ANIMAL_ID=B.ANIMAL_ID
where A.SEX_UPON_INTAKE like "%Intact%" and B.SEX_UPON_OUTCOME not like "%Intact%"
order by 1;