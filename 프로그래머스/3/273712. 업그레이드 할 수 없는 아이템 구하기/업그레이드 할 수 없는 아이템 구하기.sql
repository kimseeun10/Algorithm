-- 코드를 작성해주세요
SELECT ITEM_ID, ITEM_NAME, RARITY
FROM ITEM_INFO 
WHERE ITEM_ID NOT IN (SELECT I.ITEM_ID
                        FROM ITEM_INFO I JOIN ITEM_TREE T
                        ON I.ITEM_ID = T.PARENT_ITEM_ID)
ORDER BY ITEM_ID DESC;