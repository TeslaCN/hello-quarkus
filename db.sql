create table t_order
(
	id bigserial not null
		constraint t_order_pk
			primary key,
	order_time timestamp default CURRENT_TIMESTAMP not null,
	person_name varchar default ''::character varying not null,
	order_type varchar default 'None'::character varying not null,
	remark varchar
);

alter table t_order owner to postgres;

INSERT INTO public.t_order (id, order_time, person_name, order_type, remark) VALUES (1, '2020-06-06 16:31:16.000000', '烫烫烫', 'None', null);
INSERT INTO public.t_order (id, order_time, person_name, order_type, remark) VALUES (2, '2020-06-06 16:31:51.000000', '锟斤拷', 'Dinner', 'Double');