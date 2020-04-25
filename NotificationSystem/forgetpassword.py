import emailsend
import connection_details
def forget_password(rec_email_id,subject,text):
	#password recovery message what willbe generated
	# have to mention the subject and the text there 
	emailsend.emailsend(emailsend.ser_email,emailsend.ser_pass,rec_email_id,subject,text)
	
