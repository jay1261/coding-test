SELECT HOUR(DATETIME) as HOUR,
    count(*) as COUNT
from ANIMAL_OUTS
group by 1
having HOUR >= 09 and HOUR < 20
order by 1;