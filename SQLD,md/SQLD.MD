# 데이터베이스
- 통합하여 관리되는 데이터의 집합
## DBMS 
- 데이터베이스를 관리하기 위한 `소프트웨어`

- 관계형 데이터 베이스 (RDBMS)
    -
- 데이터를 모아둔 테이블이 서로 관계를 맺고 모여있는 집합체

## DML
- 데이터 조회 및 변경하기 위한 명령어

- DML의 종류
    -
1. 조회 SELECT (셀렉트)(테이블 조회)
2. 삽입 INSERT (인서ㅌ)
3. 삭제 DELETE (딜릿ㅌ)
4. 변경 UPDATE

## 연산자
1. 산술연산자(*,/,+,-)
2. 연결연산자(||)
3. 비교연산자
4. IS NULL, NULL , LIKE , IN
5. BETWEEN AND
6. NOT(논리부정연산자)
7. AND
8. OR

### ---
- NVL (오라클 전용) 
- 인자 2개: NULL일 때만 바꾼다.
```sql
NVL(표현식1, 표현식2)
표현식1이 NULL이면 표현식2를 출력합니다
```


- NVL2
-인자 3개: [ 대상, NULL 아닐 때, NULL 일 때 ] 순서이다.
```sql
NVL2(1, 2, 3)
- 1이 NULL이 아니면 ➡️ 2를 실행
- 1이 NULL이면 ➡️ 3을 실행
```

- COALESCE (표준 SQL) 
```sql
COALESCE(표현식1, 표현식2, 표현식3, ...)
나열된 인자 중 최초로 NULL이 아닌 값을 출력합니다.
```

## 별칭
```SQL
    SELECT SALARY*12 AS ANNUAL_SALARY FROM EMPLOYEES;
    -- AS 생략 가능하다 , 별칭으로 "월급" 한글도 사용 가능함
```
## DISTINCT(디스틴ㅌ)
- 중복을 제거하고 조회 한다
```SQL
    SELECT DISTINCT MANAGER_ID FROM EMPLOYEES;
```


