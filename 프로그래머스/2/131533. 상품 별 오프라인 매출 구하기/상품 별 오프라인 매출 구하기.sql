SELECT A.PRODUCT_CODE, 
        A.PRICE * sum(B.SALES_AMOUNT) as SALES
from PRODUCT A left join OFFLINE_SALE B on A.PRODUCT_ID=B.PRODUCT_ID
group by 1
order by 2 desc, 1;