
# Python code to illustrate Sending mail from 
# your Gmail account 
import smtplib
import sys
def send_email(sen_email,pass_email,rec_email,SUBJECT,TEXT):
	# creates SMTP session
	s = smtplib.SMTP('smtp.gmail.com:587')    #if I have the G-suit email account then we can do that here
	# start TLS for security
	s.starttls()
	message = 'Subject: {}\n\n{}'.format(SUBJECT, TEXT)
	# Authentication
	s.login(sen_email,pass_email)
	# sending the mail
	s.sendmail(sen_email,rec_email,message)
	# terminating the session
	s.quit()

#1st script  then sender email_id then password of sender email_id then the reciver email_id
