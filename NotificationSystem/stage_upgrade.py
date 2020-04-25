import cx_Oracle
import smtplib
import sys
import emailsend
import cil_con
import sender_details
import connection_details
def stage_update(project_id,status_code):
	con=cx_Oracle.connect(connection_details.Database_user_name+'/'+connection_details.Password_of_user+'@'+connection_details.IP_address+'/'+connection_details.Database_type)
	cur=con.cursor()
	sql='select status_name from csr_project_status where status_code = '+status_code 
	cur.execute(sql)
	r=fetchone();
	sql='select ngo_id,project_title from csr_project_details where project_id = '+project_id
	cur.execute(sql)
	r1=cur.fetchone()
	sql='select ngo_email from csr_ngo_details where ngo_id = '+r1[0]
	rec_email=cil_con.fetch_reciver(sql)
	message='your project '+r1[1]+' is upgrade to the '+ r[0] +' status'
	subject='Project Upgrade'
	emailsend.emailsend(sender_details.ser_email,sender_details.ser_pass,rec_email,subject,text)