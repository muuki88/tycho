package de.mukis.core;

import org.eclipse.sapphire.modeling.ModelElementType;
import org.eclipse.sapphire.modeling.Value;
import org.eclipse.sapphire.modeling.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.GenerateImpl;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.Required;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;

@GenerateImpl
public interface IDataProcessingUnit {

	ModelElementType TYPE = new ModelElementType(IDataProcessingUnit.class);

	// *** Title ***

	@XmlBinding(path = "name")
	@Label(standard = "name")
	@Required
	ValueProperty PROP_NAME = new ValueProperty(TYPE, "Name");

	Value<String> getName();

	void setName(String value);
}
