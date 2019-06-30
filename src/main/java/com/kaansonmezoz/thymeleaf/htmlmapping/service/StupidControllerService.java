package com.kaansonmezoz.thymeleaf.htmlmapping.service;

import com.kaansonmezoz.thymeleaf.htmlmapping.model.ViewModel;

public class StupidControllerService {


    public String getMappedHtml(ViewModel viewModel){
        TemplateEngineService service = new TemplateEngineService();
        return service.mapHtmlString(getHtmlString(), viewModel);
    }

    public String getHtmlString(){
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\n" +
                " <head>\n" +
                "      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1254, utf-8\">\n" +
                "      <title>MESAFELİ SATIŞ SÖZLEŞMESİ </title>\n" +
                "  </head>\n" +
                "  <style type=\"text/css\">\n" +
                "      body.distant-contract-main-body {\n" +
                "          font-family: 'Times New Roman', Times, serif;\n" +
                "      }\n" +
                "  \n" +
                "      table.distant-contract-product-table,\n" +
                "      .distant-contract-product-table th,\n" +
                "      .distant-contract-product-table td {\n" +
                "          border: 1px solid black;\n" +
                "          border-collapse: collapse;\n" +
                "      }\n" +
                "  \n" +
                "      table.distant-contract-all-tables {\n" +
                "          margin: 15px 0;\n" +
                "      }\n" +
                "  \n" +
                "      table.distant-contract-all-tables th,\n" +
                "      table.distant-contract-all-tables td {\n" +
                "          padding: 5px;\n" +
                "          text-align: left;\n" +
                "      }\n" +
                "  \n" +
                "      h3.distant-contract-title {\n" +
                "          text-align: center;\n" +
                "          text-decoration: underline;\n" +
                "      }\n" +
                "  \n" +
                "      h3.distant-contract-h3 {\n" +
                "          margin: 15px 0;\n" +
                "          text-decoration: underline;\n" +
                "      }\n" +
                "  \n" +
                "      .distant-contract-text-align-left {\n" +
                "          text-align: left\n" +
                "      }\n" +
                "  </style>\n" +
                " \n" +
                "\n" +
                "<body class=\"distant-contract-main-body\">\n" +
                "\n" +
                "      <h3 class=\"distant-contract-title\" th:text=\"'MESAFELİ SATIŞ SÖZLEŞMESİ(' + ${Model.getSubDictionary('Seller').getString('BusinessName')} + ')'\"></h3>\n" +
                "      <h3 class=\"distant-contract-h3\">MADDE 1- TARAFLAR</h3>\n" +
                "      <p><b>ALICI </b></p>\n" +
                "      <table class=\"distant-contract-all-tables\">\n" +
                "          <tbody>\n" +
                "              <tr>\n" +
                "                  <td width=\"200\" valign=\"top\"><strong>Adı – Soyadı</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td class=\"distant-contract-text-align-left\" th:text=\"${Model.getSubDictionary('Receiver').getString('FullName')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>Adresi</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td th:text=\"${Model.getSubDictionary('Receiver').getString('FullAddress')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>Telefon</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td th:text=\"${Model.getSubDictionary('Receiver').getString('PhoneNumber')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>E-posta</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td th:text=\"${Model.getSubDictionary('Receiver').getString('MailAddress')}\"></td>\n" +
                "              </tr>\n" +
                "          </tbody>\n" +
                "      </table>\n" +
                "      <p><b>SATICI</b></p>\n" +
                "      <table class=\"distant-contract-all-tables\">\n" +
                "          <tbody>\n" +
                "              <tr>\n" +
                "                  <td width=\"200\" valign=\"top\"><strong>Ticari Unvanı</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td class=\"distant-contract-text-align-left\" th:text=\"${Model.getSubDictionary('Seller').getString('BusinessName')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>Adresi</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td th:text=\"${Model.getSubDictionary('Seller').getString('BusinessAddress')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>Telefon</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td th:text=\"${Model.getSubDictionary('Seller').getString('PhoneNumber')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>Satıcı Mersis No</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td th:text=\"${Model.getSubDictionary('Seller').getString('MailAddress')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>Satıcı E-posta</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td th:text=\"${Model.getSubDictionary('Seller').getString('MailAddress')}\"></td>\n" +
                "              </tr>\n" +
                "        </tbody>\n" +
                "      </table>\n" +
                "      <div style=\"margin-bottom: 15px\">\n" +
                "          <table class=\"distant-contract-product-table distant-contract-all-tables\">\n" +
                "              <tr>\n" +
                "                  <th>Ürün Açıklaması</th>\n" +
                "                  <th>Adet</th>\n" +
                "                  <th>Peşin Fiyatı</th>\n" +
                "                  <th>Ara Toplam (KDV Dahil)</th>\n" +
                "              </tr>\n" +
                "              \n" +
                "              <tr th:each=\"item: ${Model.getListOfSubDictionaries('Products')}\">\n" +
                "                  <td th:text=\"${item.getString('Description')}\"></td>\n" +
                "                  <td th:text=\"${item.getString('Quantity')}\"></td>\n" +
                "                  <td th:text=\"${item.getString('Price') + ' TL'}\"></td>\n" +
                "                  <td th:text=\"${item.getString('SubTotal') + ' TL'}\"></td>\n" +
                "              </tr>\n" +
                "              }\n" +
                "              <tr>\n" +
                "                  <td>Kargo Tutarı</td>\n" +
                "                  <td>-</td>\n" +
                "                  <td th:text=\"${Model.getString('CargoAmount') + ' TL'}\"></td>\n" +
                "                  <td th:text=\"${Model.getString('CargoAmount') + ' TL'}\"></td>\n" +
                "              </tr>\n" +
                "              \n" +
                "              <tr th:each=\"item: ${Model.getListOfSubDictionaries('Promotions')}\">\n" +
                "                  <td th:text=\"${item.getString('DisplayName')}\"></td>\n" +
                "                  <td>-</td>\n" +
                "                  <td th:text=\"${item.getString('AppliedAmount') + ' TL'}\"></td>\n" +
                "                  <td th:text=\"${item.getString('AppliedAmount') + ' TL'}\"></td>\n" +
                "              </tr>\n" +
                "              \n" +
                "              <tr th:each=\"item: ${Model.getListOfSubDictionaries('Coupons')}\">\n" +
                "                  <td th:text=\"${item.getString('DisplayName')}\"></td>\n" +
                "                  <td>-</td>\n" +
                "                  <td th:text=\"${item.getString('AppliedAmount') + ' TL'}\"></td>\n" +
                "                  <td th:text=\"${item.getString('AppliedAmount') + ' TL'}\"></td>\n" +
                "              </tr>\n" +
                "              \n" +
                "              <tr th:if=\"not ${#strings.equals(Model.getString('InstallmentCommissionAmount'), '0')}\">\n" +
                "                  <td>Taksit Farkı</td>\n" +
                "                  <td>-</td>\n" +
                "                  <td th:text=\"${Model.getString('InstallmentCommissionAmount') + ' TL'}\"></td>\n" +
                "                  <td th:text=\"${Model.getString('InstallmentCommissionAmount') + ' TL'}\"></td>\n" +
                "              </tr>\n" +
                "              \n" +
                "              <tr>\n" +
                "                  <td>&nbsp</td>\n" +
                "                  <td>&nbsp</td>\n" +
                "                  <td>Toplam</td>\n" +
                "                  <td th:text=\"${Model.getString('NetTotal') + ' TL'}  \"></td>\n" +
                "              </tr>\n" +
                "          </table>\n" +
                "      </div>\n" +
                "      <p th:text=\"${'* ' + Model.getString('TableFootNote')}\"></p>\n" +
                "      <table class=\"distant-contract-all-tables\">\n" +
                "          <tbody>\n" +
                "              <tr>\n" +
                "                  <td width=\"200\" valign=\"top\"><strong>Teslimat Adresi</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td class=\"distant-contract-text-align-left\" th:text=\"${Model.getSubDictionary('Receiver').getString('FullAddress')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>Teslim Edilecek Kişi</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td th:text=\"${Model.getSubDictionary('Receiver').getString('FullName')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>Fatura Adresi</strong></td>\n" +
                "                  <td>:</td>    \n" +
                "                  <td th:text=\"${Model.getSubDictionary('Invoice').getString('Address')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>Sipariş Tarihi</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td th:text=\"${Model.getString('OrderDate')}\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                  <td valign=\"top\"><strong>Teslim Şekli</strong></td>\n" +
                "                  <td>:</td>\n" +
                "                  <td>Alıcıya Teslim</td>\n" +
                "              </tr>\n" +
                "          </tbody>\n" +
                "      </table>\n" +
                "</body>\n" +
                "</html>";

        return html;
    }
}
