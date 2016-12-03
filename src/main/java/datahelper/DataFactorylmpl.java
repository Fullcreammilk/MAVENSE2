package datahelper;

import datahelperinterface.CommentDataHelper;
import datahelperinterface.CompaniesDataHelper;
import datahelperinterface.CreditDataHelper;
import datahelperinterface.DataFactory;
import datahelperinterface.HotelDataHelper;
import datahelperinterface.HotelStrategyDataHelper;
import datahelperinterface.OrderDataHelper;
import datahelperinterface.RoomDataHelper;
import datahelperinterface.SubOrderDataHelper;
import datahelperinterface.UserDataHelper;
import datahelperinterface.WebStrategyDataHelper;

public class DataFactorylmpl implements DataFactory{

	public CommentDataHelper getCommentDataHelper() {
		CommentDataHelper datahelper=new CommentSqlDataHelper();
		return datahelper;
	}

	public CompaniesDataHelper getCompaniesDataHelper() {
		CompaniesDataHelper datahelper=new CompaniesSqlDataHelper();
		return datahelper;
	}

	public CreditDataHelper getCreditDataHelper() {
		CreditDataHelper datahelper=new CreditSqlDataHelper();
		return datahelper;
	}

	public HotelDataHelper getHotelDataHelper() {
		HotelDataHelper datahelper=new HotelSqlDataHelper();
		return datahelper;
	}

	public HotelStrategyDataHelper getHotelStrategyDataHelper() {
		HotelStrategyDataHelper datahelper=new HotelStrategySqlDataHelper()
;		return datahelper;
	}

	public OrderDataHelper getOrderDataHelper() {
		OrderDataHelper datahelper=new OrderSqlDataHelper();
		return datahelper;
	}

	public RoomDataHelper getRoomDataHelper() {
		RoomDataHelper datahelper=new RoomSqlDataHelper();
		return datahelper;
	}

	public SubOrderDataHelper getSubOrderDataHelper() {
		SubOrderDataHelper datahelper=new SubOrderSqlDataHelper();
		return datahelper;
	}

	public UserDataHelper getUserDataHelper() {
		UserDataHelper datahelper=new UserSqlDataHelper();
		return datahelper;
	}

	public WebStrategyDataHelper getWebStrategyDataHelper() {
		WebStrategyDataHelper datahelper=new WebStrategySqlDataHelper();
		return datahelper;
	}

}
