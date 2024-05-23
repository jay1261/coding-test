SELECT CATEGORY, sum(B.SALES) as TOTAL_SALES
from BOOK A left join BOOK_SALES B on A.BOOK_ID=B.BOOK_ID
where Month(B.SALES_DATE) = 1 and YEAR(B.SALES_DATE) = 2022
group by 1
order by 1;