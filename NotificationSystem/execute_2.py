import emailsend
import sys
import cil_con
import sender_details
def execute(type_of_operation,_id,subject,text): 
	if type_of_operation == '1':
		sql='select NGO_EMAIL from CSR_NGO_DETAILS where ngo_id = '+_id
	else :
	    sql='select CHIEF_FUNC_EMAIL from CSR_NGO_DETAILS where ngo_id = '+_id

	#i=3
	#message = ''
	#while i < len(sys.argv):
	#	message+=sys.argv[i]+' '
	#	i=i+1						this portion of code for the message from the terminal
	rec_email=cil_con.fetch_reciver(sql)
	emailsend.send_email(sender_details.ser_email,sender_details.ser_pass,rec_email,subject,text)
