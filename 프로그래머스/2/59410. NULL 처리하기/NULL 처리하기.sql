SELECT ANIMAL_TYPE, 
        if(NAME is NULL, 'No name', Name), 
        SEX_UPON_INTAKE
from ANIMAL_INS
 
