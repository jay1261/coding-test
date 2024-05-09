SELECT ANIMAL_ID, NAME, 
    date_format(date(DATETIME), "%Y-%m-%d") as "날짜"
from ANIMAL_INS;