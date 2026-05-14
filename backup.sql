--
-- PostgreSQL database dump
--

\restrict C4xdzsrmEiRoBCxEazQM6nuzLbm2FNiDxOcQW7pvwoVn6kZAX94kE6FeawhmOO7

-- Dumped from database version 15.14 (Debian 15.14-1.pgdg13+1)
-- Dumped by pg_dump version 15.14 (Debian 15.14-1.pgdg13+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: categoria; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.categoria (
    id bigint NOT NULL,
    eliminado boolean NOT NULL,
    descripcion character varying(255),
    nombre character varying(255)
);


ALTER TABLE public.categoria OWNER TO root;

--
-- Name: categoria_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.categoria_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.categoria_id_seq OWNER TO root;

--
-- Name: categoria_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.categoria_id_seq OWNED BY public.categoria.id;


--
-- Name: detalle_pedido; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.detalle_pedido (
    id bigint NOT NULL,
    eliminado boolean NOT NULL,
    cantidad integer,
    subtotal double precision,
    producto_id bigint,
    pedido_id bigint
);


ALTER TABLE public.detalle_pedido OWNER TO root;

--
-- Name: detalle_pedido_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.detalle_pedido_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.detalle_pedido_id_seq OWNER TO root;

--
-- Name: detalle_pedido_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.detalle_pedido_id_seq OWNED BY public.detalle_pedido.id;


--
-- Name: direccion; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.direccion (
    id bigint NOT NULL,
    eliminado boolean NOT NULL,
    calle character varying(255),
    departamento smallint,
    dpt integer NOT NULL,
    numero character varying(255),
    piso integer NOT NULL,
    CONSTRAINT direccion_departamento_check CHECK (((departamento >= 0) AND (departamento <= 5)))
);


ALTER TABLE public.direccion OWNER TO root;

--
-- Name: direccion_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.direccion_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.direccion_id_seq OWNER TO root;

--
-- Name: direccion_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.direccion_id_seq OWNED BY public.direccion.id;


--
-- Name: imagen_producto; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.imagen_producto (
    id bigint NOT NULL,
    eliminado boolean NOT NULL,
    nombre character varying(255),
    public_id character varying(255),
    url character varying(255)
);


ALTER TABLE public.imagen_producto OWNER TO root;

--
-- Name: imagen_producto_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.imagen_producto_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.imagen_producto_id_seq OWNER TO root;

--
-- Name: imagen_producto_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.imagen_producto_id_seq OWNED BY public.imagen_producto.id;


--
-- Name: pedido; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.pedido (
    id bigint NOT NULL,
    eliminado boolean NOT NULL,
    celular character varying(255),
    dni character varying(255),
    entrega smallint,
    envio double precision,
    estado smallint,
    fecha timestamp(6) without time zone,
    forma_pago smallint,
    nombre_cliente character varying(255),
    total double precision,
    direccion_id bigint,
    sucursal_id bigint,
    CONSTRAINT pedido_entrega_check CHECK (((entrega >= 0) AND (entrega <= 1))),
    CONSTRAINT pedido_estado_check CHECK (((estado >= 0) AND (estado <= 4))),
    CONSTRAINT pedido_forma_pago_check CHECK (((forma_pago >= 0) AND (forma_pago <= 1)))
);


ALTER TABLE public.pedido OWNER TO root;

--
-- Name: pedido_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.pedido_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pedido_id_seq OWNER TO root;

--
-- Name: pedido_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.pedido_id_seq OWNED BY public.pedido.id;


--
-- Name: producto; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.producto (
    id bigint NOT NULL,
    eliminado boolean NOT NULL,
    descripcion character varying(255),
    deshabilitado boolean,
    nombre character varying(255),
    precio double precision,
    categoria_id bigint,
    imagen_id bigint
);


ALTER TABLE public.producto OWNER TO root;

--
-- Name: producto_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.producto_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.producto_id_seq OWNER TO root;

--
-- Name: producto_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.producto_id_seq OWNED BY public.producto.id;


--
-- Name: sucursal; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.sucursal (
    id bigint NOT NULL,
    eliminado boolean NOT NULL,
    nombre character varying(255),
    direccion_id bigint
);


ALTER TABLE public.sucursal OWNER TO root;

--
-- Name: sucursal_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.sucursal_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sucursal_id_seq OWNER TO root;

--
-- Name: sucursal_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.sucursal_id_seq OWNED BY public.sucursal.id;


--
-- Name: categoria id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.categoria ALTER COLUMN id SET DEFAULT nextval('public.categoria_id_seq'::regclass);


--
-- Name: detalle_pedido id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.detalle_pedido ALTER COLUMN id SET DEFAULT nextval('public.detalle_pedido_id_seq'::regclass);


--
-- Name: direccion id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.direccion ALTER COLUMN id SET DEFAULT nextval('public.direccion_id_seq'::regclass);


--
-- Name: imagen_producto id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.imagen_producto ALTER COLUMN id SET DEFAULT nextval('public.imagen_producto_id_seq'::regclass);


--
-- Name: pedido id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.pedido ALTER COLUMN id SET DEFAULT nextval('public.pedido_id_seq'::regclass);


--
-- Name: producto id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.producto ALTER COLUMN id SET DEFAULT nextval('public.producto_id_seq'::regclass);


--
-- Name: sucursal id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.sucursal ALTER COLUMN id SET DEFAULT nextval('public.sucursal_id_seq'::regclass);


--
-- Data for Name: categoria; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.categoria (id, eliminado, descripcion, nombre) FROM stdin;
1	f		Ravioles
2	f		Salsas
3	f		Fideos
4	f		Especialidades
5	f		Ñoquis
\.


--
-- Data for Name: detalle_pedido; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.detalle_pedido (id, eliminado, cantidad, subtotal, producto_id, pedido_id) FROM stdin;
1	f	1	1	15	1
2	f	1	1	16	2
3	f	1	1	16	3
4	f	1	1	15	4
5	f	2	2	16	5
6	f	1	1	15	6
7	f	1	1	15	7
8	f	1	1	16	7
9	f	1	1	15	8
10	f	1	1	15	9
11	f	1	1	16	9
12	f	1	1	15	10
13	f	1	10200	17	11
14	f	1	10200	17	12
15	f	1	5100	20	13
16	f	1	6000	18	13
17	f	1	10200	17	13
18	f	1	10200	17	14
19	f	1	10200	17	15
20	f	1	6000	18	16
21	f	1	10200	17	17
22	f	1	10200	17	18
23	f	1	10200	17	19
24	f	1	6000	18	20
25	f	1	10200	17	20
26	f	2	20400	17	21
27	f	2	20400	17	22
\.


--
-- Data for Name: direccion; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.direccion (id, eliminado, calle, departamento, dpt, numero, piso) FROM stdin;
1	f	Pedro Vargas	0	0	3406	0
2	f	Tropero Sosa	0	0	457	0
3	f	Tropero Sosa	0	0	491	0
4	f	Pedro Vargas	0	0	3406	0
5	f	Pedro Vargas	0	0	3406	0
6	f	Tropero Sosa	0	0	457	0
7	f	Tropero Sosa	0	0	491	0
8	f	Pedro Vargas	0	0	3406	0
\.


--
-- Data for Name: imagen_producto; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.imagen_producto (id, eliminado, nombre, public_id, url) FROM stdin;
1	f	palomo.jpg	qo1semlsypkqi0vo0tob	https://res.cloudinary.com/dnmh6ptnq/image/upload/v1756422224/qo1semlsypkqi0vo0tob.jpg
2	f	palomo.jpg	kknllzvb2kpxxsjduxor	https://res.cloudinary.com/dnmh6ptnq/image/upload/v1756422407/kknllzvb2kpxxsjduxor.jpg
3	f	Untitled diagram _ Mermaid Chart-2025-08-06-152333.png	i3mowzcsqc2amqorgsez	https://res.cloudinary.com/dnmh6ptnq/image/upload/v1756963868/i3mowzcsqc2amqorgsez.png
4	f	burguer.jpeg	qv3ng4if5cjdiyknlcg8	https://res.cloudinary.com/dnmh6ptnq/image/upload/v1756964283/qv3ng4if5cjdiyknlcg8.jpg
5	f	IconoWatsapp.png	cbm8ej91vuafgi9x31qb	https://res.cloudinary.com/dnmh6ptnq/image/upload/v1756964294/cbm8ej91vuafgi9x31qb.png
6	f	2000 (1).png	b2jmzzgfbfz7rnxjl3ez	https://res.cloudinary.com/dnmh6ptnq/image/upload/v1757295861/b2jmzzgfbfz7rnxjl3ez.png
7	f	imagen todo negro.png	i4nvltyxtcg9xzh5mcck	https://res.cloudinary.com/dnmh6ptnq/image/upload/v1759536796/i4nvltyxtcg9xzh5mcck.png
8	f	images.jpg	ncl4bvokbhpbkncmdvjk	https://res.cloudinary.com/dnmh6ptnq/image/upload/v1761619127/ncl4bvokbhpbkncmdvjk.jpg
\.


--
-- Data for Name: pedido; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.pedido (id, eliminado, celular, dni, entrega, envio, estado, fecha, forma_pago, nombre_cliente, total, direccion_id, sucursal_id) FROM stdin;
2	f	1111111111	11111111	0	2700	4	2025-09-08 00:13:54.03898	0	111111111	1	2	1
1	f	1111111111	11111111	1	0	2	2025-09-08 00:12:55.186281	0	dddd	1	\N	1
3	f	1111111111	11111111	0	2700	1	2025-09-09 23:01:31.771498	0	1111	1	3	1
4	f	1111111111	11111111	0	0	1	2025-09-09 23:04:38.654772	0	111111111111111	1	4	1
5	f	1111111111	11111111	0	0	1	2025-09-09 23:06:51.79837	0	11111111111111	2	5	1
6	f	1111111111	11111111	1	0	0	2025-09-09 23:55:48.837624	0	11111111111111111111111	1	\N	1
8	f	1234567891	12345678	1	0	1	2025-10-03 20:13:26.019423	0	ddddd	1	\N	1
9	f	1234567891	12345678	0	2700	1	2025-10-03 20:14:49.035697	0	ssssss	2	7	1
10	f	1111111111	11111111	1	0	1	2025-10-03 20:17:10.441284	0	111111	1	\N	1
7	f	2613333899	46162962	0	2700	0	2025-10-01 21:12:43.405127	0	matias tari	2	6	1
11	f	1231231212	12315646	1	0	1	2025-10-03 20:57:48.527263	0	mat	10200	\N	1
12	f	1231231231	12312312	0	0	1	2025-10-03 21:01:02.06679	0	aaaaaaaa	10200	8	1
13	f	2616590525	18842609	1	0	0	2025-10-03 21:22:43.782418	0	Ivan Moreno	21300	\N	1
14	f	1111111111	11111111	1	0	1	2025-10-27 23:17:56.515934	0	test	10200	\N	1
15	f	1111111111	11111111	1	0	1	2025-10-27 23:37:40.316841	0	test	10200	\N	1
16	f	1111111111	11111111	1	0	1	2025-10-27 23:39:34.386682	0	test	6000	\N	1
17	f	1111111111	11111111	1	0	1	2025-10-27 23:40:22.067582	0	test	10200	\N	1
18	f	1111111111	11111111	1	0	1	2025-10-27 23:54:25.214713	0	test	10200	\N	1
19	f	1111111111	11111111	1	0	1	2025-10-27 23:54:59.773596	0	test	10200	\N	1
20	f	1111111111	11111111	1	0	1	2025-10-27 23:55:43.090707	0	test	16200	\N	1
21	f	1111111111	11111111	1	0	1	2025-10-28 00:11:34.313543	0	test	20400	\N	1
22	f	1111111111	11111111	1	0	1	2025-10-28 00:12:02.391836	0	test	20400	\N	1
\.


--
-- Data for Name: producto; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.producto (id, eliminado, descripcion, deshabilitado, nombre, precio, categoria_id, imagen_id) FROM stdin;
9	t	ss	f	asdfasdfasdfasdf	1	1	\N
8	t	1	f	asdasdasd	1	1	\N
6	t	1	f	asdfasdf	1	1	\N
7	t	ninguna	f	Producto de prueba 5	1	1	\N
5	t	ninguna	f	Producto de prueba 4	1	1	\N
4	t	Testeo 1	f	Producto de prueba 4	1	1	\N
3	t	notiene	f	Producto de prueba 3	1	1	\N
14	t	ASDAS	f	Producto de prueba 11	1	1	3
1	t	no tiene	f	Producto de prueba	1	1	1
10	t	1	f	Producto de prueba 444	1	1	\N
11	t	12	f	producto 123	1	1	\N
12	t	1	f	Producto de prueba 99	1	1	\N
13	t	ASDAS	f	Producto de prueba 4111	1	1	\N
2	t	No tiene	f	Producto de prueba 2	2	1	4
15	t	1	f	producto test 3	1	1	5
16	t	no tiene	f	aaa	1	2	6
19	t	1	f	Prueba	1	2	7
21	f	Caja de 15 unidades, sorrentinos artesanales, rinde 2 porciones.	f	Sorrentinos de muzzarella y jamon 	10500	4	\N
22	f	Paquete de 500gr, rinde 2 porciones.	f	Ñoquis de papa	5500	5	\N
20	f	500gr de fideos, rinde 3 porciones.	f	Fideos puro huevo	5100	3	\N
17	f	2 planchas de 48 ravioles c/u. Peso aproximado 800gr	f	Ravioles de ricota y jamon	10200	1	\N
18	f	Pote de salsa casera. 	f	Salsa bolognesa	6000	2	8
\.


--
-- Data for Name: sucursal; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.sucursal (id, eliminado, nombre, direccion_id) FROM stdin;
1	f	Sucursal Pedro Vargas	1
\.


--
-- Name: categoria_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.categoria_id_seq', 5, true);


--
-- Name: detalle_pedido_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.detalle_pedido_id_seq', 27, true);


--
-- Name: direccion_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.direccion_id_seq', 8, true);


--
-- Name: imagen_producto_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.imagen_producto_id_seq', 8, true);


--
-- Name: pedido_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.pedido_id_seq', 22, true);


--
-- Name: producto_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.producto_id_seq', 22, true);


--
-- Name: sucursal_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.sucursal_id_seq', 1, true);


--
-- Name: categoria categoria_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.categoria
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (id);


--
-- Name: detalle_pedido detalle_pedido_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.detalle_pedido
    ADD CONSTRAINT detalle_pedido_pkey PRIMARY KEY (id);


--
-- Name: direccion direccion_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.direccion
    ADD CONSTRAINT direccion_pkey PRIMARY KEY (id);


--
-- Name: imagen_producto imagen_producto_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.imagen_producto
    ADD CONSTRAINT imagen_producto_pkey PRIMARY KEY (id);


--
-- Name: pedido pedido_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_pkey PRIMARY KEY (id);


--
-- Name: producto producto_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_pkey PRIMARY KEY (id);


--
-- Name: sucursal sucursal_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.sucursal
    ADD CONSTRAINT sucursal_pkey PRIMARY KEY (id);


--
-- Name: pedido uk_2lh8uqayatwwopmwye4sdpp66; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT uk_2lh8uqayatwwopmwye4sdpp66 UNIQUE (direccion_id);


--
-- Name: producto uk_5l580xj0mqbgg69jc1cl21yxk; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.producto
    ADD CONSTRAINT uk_5l580xj0mqbgg69jc1cl21yxk UNIQUE (imagen_id);


--
-- Name: sucursal uk_l4uaatssksxv3p4gao7q3yx1q; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.sucursal
    ADD CONSTRAINT uk_l4uaatssksxv3p4gao7q3yx1q UNIQUE (direccion_id);


--
-- Name: detalle_pedido fk2yc3nts8mdyqf6dw6ndosk67a; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.detalle_pedido
    ADD CONSTRAINT fk2yc3nts8mdyqf6dw6ndosk67a FOREIGN KEY (producto_id) REFERENCES public.producto(id);


--
-- Name: pedido fk3ks2hug06ddfndlg1rqw1xmr9; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT fk3ks2hug06ddfndlg1rqw1xmr9 FOREIGN KEY (sucursal_id) REFERENCES public.sucursal(id);


--
-- Name: pedido fkeuawl7ohmc0vexy5jwu7d7bjw; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT fkeuawl7ohmc0vexy5jwu7d7bjw FOREIGN KEY (direccion_id) REFERENCES public.direccion(id);


--
-- Name: detalle_pedido fkgqvba9e7dildyw45u0usdj1k2; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.detalle_pedido
    ADD CONSTRAINT fkgqvba9e7dildyw45u0usdj1k2 FOREIGN KEY (pedido_id) REFERENCES public.pedido(id);


--
-- Name: sucursal fkk4e07r5ywhsi8klk9la7u00mw; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.sucursal
    ADD CONSTRAINT fkk4e07r5ywhsi8klk9la7u00mw FOREIGN KEY (direccion_id) REFERENCES public.direccion(id);


--
-- Name: producto fkodqr7965ok9rwquj1utiamt0m; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.producto
    ADD CONSTRAINT fkodqr7965ok9rwquj1utiamt0m FOREIGN KEY (categoria_id) REFERENCES public.categoria(id);


--
-- Name: producto fksdxlreo9cte0y6pxql35o1cv6; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.producto
    ADD CONSTRAINT fksdxlreo9cte0y6pxql35o1cv6 FOREIGN KEY (imagen_id) REFERENCES public.imagen_producto(id);


--
-- PostgreSQL database dump complete
--

\unrestrict C4xdzsrmEiRoBCxEazQM6nuzLbm2FNiDxOcQW7pvwoVn6kZAX94kE6FeawhmOO7

