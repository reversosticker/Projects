import connection_details
import emailsend
import sender_details
import sys
from validate_email import validate_email
def confirmation_mail(rec_email,pro_name):   #here is the arguments which are used to send the details to the rec_email
	text = 'your project is registered'+pro_name
	subject='successfull registered'	
	#email verifiaction and program called 
	#if email verification is successfull then add the insert the data and belongs to the project
	#is_valid=validate_email(rec_email,verify=True)
	#if is_valid:
	emailsend.send_email(sender_details.ser_email,sender_details.ser_pass,rec_email,subject,text) 		
#confirmation_mail(sys.argv[1],sys.argv[2]) 		
#remaining to install python DNSinstall serives
