package ad.client.module.form;

import rnd.bean.ApplicationBean;
import rnd.bean.ApplicationDynaBean;
import rnd.expression.Expression;
import rnd.mywt.client.application.AbstractFormHelper;
import rnd.mywt.client.data.impl.FilterInfoImpl;
import rnd.mywt.client.mvc.field.data.ReferenceField;
import rnd.mywt.client.mvc.field.data.text.TextField;
import rnd.mywt.client.mvc.page.board.DataBoard;
import rnd.mywt.client.mvc.page.form.Form;

public class ApplicationBeanFormHelper extends AbstractFormHelper {

	public ApplicationBeanFormHelper() {
		super("AD", "ApplicationBean", "ApplicationBean", "ApplicationBean");
	}

	public Form createForm() {

		Form form = super.createForm();

		TextField name_TF = createTextField("Name", "name");
		form.addField(name_TF);

		TextField className_TF = createTextField("Class Name", "className");
		form.addField(className_TF);

		return form;
	}

	@Override
	public DataBoard createDataBoard() {

		DataBoard dataBoard = createDataBoard("AD", "ApplicationBean", "ApplicationBean");

		ReferenceField applicationId_RF = createReferenceField("Application", "AD", "Application", "Application", "Name");
		Expression applicationIdCtxExp = dataBoard.addContextField("applicationId", applicationId_RF);

		ReferenceField moduleId_RF = createReferenceField("Module", "AD", "Module", "Module", "Name");
		Expression moduleIdCtxExp = dataBoard.addContextField("moduleId", moduleId_RF);

		FilterInfoImpl filterInfo = new FilterInfoImpl("default");

		filterInfo.setFilterParamExpressionObjects(dataBoard.getModel(), dataBoard.getModel());
		filterInfo.setFilterParamExpressions(applicationIdCtxExp, moduleIdCtxExp);

		dataBoard.setFilter(filterInfo);

		return dataBoard;

	}

	@Override
	public ApplicationBean createApplicationBean() {
		return new ApplicationDynaBean("ad.server.ApplicationBean");
	}

}
