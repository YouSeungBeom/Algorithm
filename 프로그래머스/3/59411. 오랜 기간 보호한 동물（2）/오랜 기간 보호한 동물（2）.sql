-- 코드를 입력하세요
SELECT animal_outs.animal_id, animal_outs.name
from animal_ins, animal_outs
where animal_ins.animal_id = animal_outs.animal_id
order by animal_outs.datetime - animal_ins.datetime desc
limit 2;