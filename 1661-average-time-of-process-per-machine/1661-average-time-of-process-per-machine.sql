# Write your MySQL query statement below
select machine_id , ROUND(AVG(end_time - start_time),3) as processing_time
from ( 
    select machine_id,process_id,
        MAX(CASE When activity_type = 'start' then timestamp end) as start_time,
        MAX(CASE when activity_type = 'end' then timestamp end) as end_time
    from Activity
    Group by machine_id,process_id
) t group by machine_id;