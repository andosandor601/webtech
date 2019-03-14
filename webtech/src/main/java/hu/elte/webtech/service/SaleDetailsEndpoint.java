package hu.elte.webtech.service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import hu.elte.webtech.sales.GetSaleDetailsRequest;
import hu.elte.webtech.sales.GetSaleDetailsResponse;
import hu.elte.webtech.sales.SaleDetails;

@Endpoint
public class SaleDetailsEndpoint {

    @PayloadRoot(namespace = "http://elte.hu/webtech/sales", localPart = "GetSaleDetailsRequest")
    @ResponsePayload
    public GetSaleDetailsResponse processCourseDetailsRequest(@RequestPayload GetSaleDetailsRequest request) throws DatatypeConfigurationException {
        GetSaleDetailsResponse response = new GetSaleDetailsResponse();

        SaleDetails saleDetails = new SaleDetails();
        saleDetails.setProductId(1);
        saleDetails.setCustomerId(1);
        saleDetails.setAmount(32);
        saleDetails.setPrice(100.32);
        GregorianCalendar calendar = GregorianCalendar.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()));
        saleDetails.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));

        response.setSaleDetails(saleDetails);

        return response;
    }

}
