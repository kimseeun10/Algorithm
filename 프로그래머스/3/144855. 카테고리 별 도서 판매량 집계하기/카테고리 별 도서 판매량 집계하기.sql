-- 코드를 입력하세요

SELECT CATEGORY, SUM(S.SALES) AS TOTAL_SALES
FROM BOOK B JOIN BOOK_SALES S
ON B.BOOK_ID = S.BOOK_ID
WHERE TO_CHAR(S.SALES_DATE, 'YYYY-MM-DD') LIKE '2022-01%'
GROUP BY B.CATEGORY
ORDER BY B.CATEGORY ASC;
