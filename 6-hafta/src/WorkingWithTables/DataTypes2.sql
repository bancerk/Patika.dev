**İsim**                          **Tanım**
character varying(n), varchar(n)  variable-length with limit
character(n), char(n)             fixed-length, blank padded
text                              variable unlimited length

**isim**                                 **Tanım**
timestamp [ (p) ] [ without time zone ]  both date and time (no time zone)
timestamp [ (p) ] with time zone         both date and time, with time zone
date                                     date (no time of day)
time [ (p) ] [ without time zone ]       time of day (no date)
time [ (p) ] with time zone              time of day (no date), with time zone
interval [ fields ] [ (p) ]              time interval
