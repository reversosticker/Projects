import cx_Oracle
import smtplib
import sys
import connection_details
def fetch_reciver(que_exe):
	con=cx_Oracle.connect(connection_details.Database_user_name+'/'+connection_details.Password_of_user+'@'+connection_details.IP_address+'/'+connection_details.Database_type)
	cur=con.cursor() 
	cur.execute(que_exe) 
	r=cur.fetchone()
	rec_email=r[0]
	cur.close() # close the cursor
	con.close()#close the connection between them
	return rec_email
			
#CIL_CSR   password  	CoalIndia
#project status project id and stage for updation of project 
#query project id  
#forget password 
