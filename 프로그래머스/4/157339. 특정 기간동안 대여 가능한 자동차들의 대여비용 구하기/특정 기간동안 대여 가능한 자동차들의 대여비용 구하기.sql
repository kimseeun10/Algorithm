-- 코드를 입력하세요
SELECT A.CAR_ID, A.CAR_TYPE, ROUND(A.DAILY_FEE*30*(100-B.DISCOUNT_RATE)/100) AS FEE
FROM CAR_RENTAL_COMPANY_CAR A JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN B
ON A.CAR_TYPE = B.CAR_TYPE
WHERE A.CAR_TYPE IN ('세단', 'SUV') AND B.DURATION_TYPE = '30일 이상'
      AND A.CAR_ID NOT IN (SELECT CAR_ID 
                            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
                           WHERE TO_CHAR(START_DATE,'YYYY-MM-DD') <= '2022-11-30' 
                           AND TO_CHAR(END_DATE,'YYYY-MM-DD') >= '2022-11-01')
       AND ROUND(A.DAILY_FEE*30*(100-B.DISCOUNT_RATE)/100) >= 300000
       AND ROUND(A.DAILY_FEE*30*(100-B.DISCOUNT_RATE)/100) < 2000000
ORDER BY 3 DESC, 2 ASC, 1 DESC;
