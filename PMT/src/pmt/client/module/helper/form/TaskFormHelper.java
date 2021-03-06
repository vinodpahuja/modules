//package pmt.client.module.helper.form;
//
//import pmt.client.Task;
//import rnd.mywt.client.application.AbstractFormHelper;
//import rnd.mywt.client.data.impl.FilterInfoImpl;
//import rnd.mywt.client.expression.BeanPropertyExpression;
//import rnd.mywt.client.mvc.field.data.ReferenceField;
//import rnd.mywt.client.mvc.field.data.text.TextArea;
//import rnd.mywt.client.mvc.field.data.text.TextField;
//import rnd.mywt.client.mvc.page.form.Form;
//
//public class TaskFormHelper extends AbstractFormHelper {
//
//	public ApplicationBean createApplicationBean() {
//		return new Task();
//	}
//
//	public Form createForm() {
//
//		Form form = super.createForm();
//
//		TextField name_TextField = createTextField("Task", "taskName");
//		form.addField(name_TextField);
//		
//		TextArea desc_TextArea = createTextArea("Description", "description");
//		form.addField(desc_TextArea);
//
//		ReferenceField project_RF = createReferenceField("Project", "projectId", "PMT", "Project", "Project", "ProjectName");
//		form.addField(project_RF);
//
//		ReferenceField phase_RF = createReferenceField("Phase", "phaseId", "PMT", "Project", "Phase", "PhaseName");
//
//		FilterInfoImpl filterInfo = new FilterInfoImpl("Project");
//		filterInfo.setFilterParamExpressions(new BeanPropertyExpression(ReferenceField.VALUE));
//		filterInfo.setFilterParamExpressionObjects(project_RF);
//
//		phase_RF.setFilter(filterInfo);
//
//		form.addField(phase_RF);
//
//		ReferenceField createdBy_RF = createReferenceField("Created By", "createdById", "AA", "User", "User", "UserName");
//		form.addField(createdBy_RF);
//
//		return form;
//
//	}
//
//	public String getFormName() {
//		return "Task";
//	}
//
//	public String getViewName() {
//		return "Task";
//	}
//
//}