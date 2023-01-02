SELECT * FROM dept;
SELECT * FROM emp;
SELECT * FROM emp, dept;

SELECT * FROM emp, dept WHERE emp.`dept_id`=dept.`id`;

SELECT emp.`NAME`, emp.`gender`, dept.`NAME` FROM emp, dept WHERE emp.`dept_id`=dept.`id`;

SELECT
	e.`NAME`,
	e.`gender`,
	d.`NAME`
FROM
	emp e,
	dept d
WHERE
	e.`dept_id`=d.`id`;
	
SELECT * FROM emp INNER JOIN dept ON emp.`dept_id`=dept.`id`;
SELECT * FROM emp JOIN dept ON emp.`dept_id`=dept.`id`;

SELECT
	e.*,
	d.`NAME`
FROM
	emp e,
	dept d
WHERE
	e.`dept_id`=d.`id`;

SELECT e.*, d.`NAME` FROM emp e LEFT JOIN dept d ON e.`dept_id`=d.`id`;

-- 查询工资最高的员工信息
-- 1. 查询最高工资是多少？9000
SELECT MAX(emp.`salary`) FROM emp;

-- 2. 查询员工信息，并且工资等于9000
SELECT * FROM emp WHERE emp.`salary`=9000;

-- 一条语句完成这个操作
SELECT 
	* 
FROM 
	emp 
WHERE 
	emp.`salary`=(SELECT MAX(emp.`salary`) FROM emp);
