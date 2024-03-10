import requests
url="http://desktop-icap7jl:8080/RSI_Server_4/HelloWorldImplService?wsdl"
#headers = {'content-type': 'application/soap+xml'}
headers = {'content-type': 'text/xml'}
body = """<?xml version="1.0" encoding="UTF-8"?>
         <SOAP-ENV:Envelope xmlns:ns0="http://rsi_server/" xmlns:ns1="http://schemas.xmlsoap.org/soap/envelope/" 
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
            <SOAP-ENV:Header/>
              <ns1:Body><ns0:getProducts/></ns1:Body>
         </SOAP-ENV:Envelope>"""

response = requests.post(url,data=body,headers=headers)
print(response.content)