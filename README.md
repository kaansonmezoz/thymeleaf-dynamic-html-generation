This project aims to create  different html templates with thymeleaf without modifying the view models.
All you have to do is, call the proper function for your needs.

* If you want to access Seller.BusinessName you need to call:
    Model.getSubDictionary('Seller').getString('BusinessName')

* If you want to access the list of Products' sub dictionaries you need to call:
    Model.getListOfSubDictionaries('Products') this will return a list of subdirectories
    which you can iterate through by th-each since they are dictionaries you need to call 
    getString(), getInt() etc... 

* If you want to access a list of items which are not directories all you need to call:
    Model.getList('someKey')   




Example of Get Request. Don't forget to set Content-Type as application/json
``
`{
	"Seller": {
		"BusinessName": "ajsdfkljasdf",
		"BusinessAddress": "klajsdfkljsadf",
		"PhoneNumber": "564654564",
		"MailAddress": "kljsadkfjlasdf"
	},
	
	"Receiver": {
		"FullName": "Kaan Sönmezöz",
		"FullAddress": "lkşjsadkflas",
		"PhoneNumber": "6546465",
		"MailAddress": "asdkjfasjdf"
	},
	
	"Products": [
		{
			"Description": "1",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "2",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "3",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "4",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "5",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "6",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "7",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "8",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "9",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "10",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "11",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		},
		{
			"Description": "12",
			"Quantity": "1aasdf",
			"Price": "akdjsflksafk",
			"SubTotal": "asdjfl"
		}
	],
	"CargoAmount": "15",
	"Promotions": [
		{
			"DisplayName": "Promo-1",
			"AppliedAmount": "234"	
		},
		{
			"DisplayName": "Promo-2",
			"AppliedAmount": "234"	
		},
		{
			"DisplayName": "Promo-3",
			"AppliedAmount": "234"	
		}
	],
	"InstallmentCommissionAmount":"asdfasdf",
	"NetTotal": "akldjfffs",
	"TableFootNote":"aaaaaa",
	"Invoice": {
		"Address":"kaldsjfkladjsfkladjsf"
	},
	"OrderDate": "askdfjlaskdjf",
	"Coupons": [
		{
			"DisplayName": "coupon-1",
			"AppliedAmount": "234"
		},	
		{
			"DisplayName": "coupon-2",
			"AppliedAmount": "234"
		}	
	]
}```

Example of HTML template
``````
`<!DOCTYPE html>
<html>

 <head>
      <meta http-equiv="Content-Type" content="text/html; charset=windows-1254, utf-8">
  </head> 

<body>
      <h3 class="distant-contract-title" th:text="'MESAFELİ SATIŞ SÖZLEŞMESİ(' + ${Model.getSubDictionary('Seller').getString('BusinessName')} + ')'"></h3>
      <h3 class="distant-contract-h3">MADDE 1- TARAFLAR</h3>
      <p><b>ALICI </b></p>
      <table class="distant-contract-all-tables">
          <tbody>
              <tr>
                  <td width="200" valign="top"><strong>Adı – Soyadı</strong></td>
                  <td>:</td>
                  <td class="distant-contract-text-align-left" th:text="${Model.getSubDictionary('Receiver').getString('FullName')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>Adresi</strong></td>
                  <td>:</td>
                  <td th:text="${Model.getSubDictionary('Receiver').getString('FullAddress')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>Telefon</strong></td>
                  <td>:</td>
                  <td th:text="${Model.getSubDictionary('Receiver').getString('PhoneNumber')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>E-posta</strong></td>
                  <td>:</td>
                  <td th:text="${Model.getSubDictionary('Receiver').getString('MailAddress')}"></td>
              </tr>
          </tbody>
      </table>
      <p><b>SATICI</b></p>
      <table class="distant-contract-all-tables">
          <tbody>
              <tr>
                  <td width="200" valign="top"><strong>Ticari Unvanı</strong></td>
                  <td>:</td>
                  <td class="distant-contract-text-align-left" th:text="${Model.getSubDictionary('Seller').getString('BusinessName')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>Adresi</strong></td>
                  <td>:</td>
                  <td th:text="${Model.getSubDictionary('Seller').getString('BusinessAddress')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>Telefon</strong></td>
                  <td>:</td>
                  <td th:text="${Model.getSubDictionary('Seller').getString('PhoneNumber')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>Satıcı Mersis No</strong></td>
                  <td>:</td>
                  <td th:text="${Model.getSubDictionary('Seller').getString('MailAddress')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>Satıcı E-posta</strong></td>
                  <td>:</td>
                  <td th:text="${Model.getSubDictionary('Seller').getString('MailAddress')}"></td>
              </tr>
        </tbody>
      </table>
      <div style="margin-bottom: 15px">
          <table class="distant-contract-product-table distant-contract-all-tables">
              <tr>
                  <th>Ürün Açıklaması</th>
                  <th>Adet</th>
                  <th>Peşin Fiyatı</th>
                  <th>Ara Toplam (KDV Dahil)</th>
              </tr>
              
              <tr th:each="item: ${Model.getListOfSubDictionaries('Products')}">
                  <td th:text="${item.getString('Description')}"></td>
                  <td th:text="${item.getString('Quantity')}"></td>
                  <td th:text="${item.getString('Price') + ' TL'}"></td>
                  <td th:text="${item.getString('SubTotal') + ' TL'}"></td>
              </tr>
              }
              <tr>
                  <td>Kargo Tutarı</td>
                  <td>-</td>
                  <td th:text="${Model.getString('CargoAmount') + ' TL'}"></td>
                  <td th:text="${Model.getString('CargoAmount') + ' TL'}"></td>
              </tr>
              
              <tr th:each="item: ${Model.getListOfSubDictionaries('Promotions')}">
                  <td th:text="${item.getString('DisplayName')}"></td>
                  <td>-</td>
                  <td th:text="${item.getString('AppliedAmount') + ' TL'}"></td>
                  <td th:text="${item.getString('AppliedAmount') + ' TL'}"></td>
              </tr>
              
              <tr th:each="item: ${Model.getListOfSubDictionaries('Coupons')}">
                  <td th:text="${item.getString('DisplayName')}"></td>
                  <td>-</td>
                  <td th:text="${item.getString('AppliedAmount') + ' TL'}"></td>
                  <td th:text="${item.getString('AppliedAmount') + ' TL'}"></td>
              </tr>
              
              <tr th-if:"Model.getInt('InstallmentCommissionAmount') != 0">
                  <td>Taksit Farkı</td>
                  <td>-</td>
                  <td th:text="${Model.getString('InstallmentCommissionAmount') + ' TL'}"></td>
                  <td th:text="${Model.getString('InstallmentCommissionAmount') + ' TL'}"></td>
              </tr>
              
              <tr>
                  <td>&nbsp</td>
                  <td>&nbsp</td>
                  <td>Toplam</td>
                  <td th:text="${Model.getString('NetTotal') + ' TL'}  "></td>
              </tr>
          </table>
      </div>
      <p th:text="${'* ' + Model.getString('TableFootNote')}"></p>
      <table class="distant-contract-all-tables">
          <tbody>
              <tr>
                  <td width="200" valign="top"><strong>Teslimat Adresi</strong></td>
                  <td>:</td>
                  <td class="distant-contract-text-align-left" th:text="${Model.getSubDictionary('Receiver').getString('FullAddress')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>Teslim Edilecek Kişi</strong></td>
                  <td>:</td>
                  <td th:text="${Model.getSubDictionary('Receiver').getString('FullName')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>Fatura Adresi</strong></td>
                  <td>:</td>    
                  <td th:text="${Model.getSubDictionary('Invoice').getString('Address')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>Sipariş Tarihi</strong></td>
                  <td>:</td>
                  <td th:text="${Model.getString('OrderDate')}"></td>
              </tr>
              <tr>
                  <td valign="top"><strong>Teslim Şekli</strong></td>
                  <td>:</td>
                  <td>Alıcıya Teslim</td>
              </tr>
          </tbody>
      </table>
</body>
</html>`
``````


TODOs: 
* Error Handling
* Error messages
* Exception handling

