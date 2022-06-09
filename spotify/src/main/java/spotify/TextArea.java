package spotify;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;

@Tag("textarea")
public class TextArea extends Component implements HasSize{
	
	public TextArea() {
		 getElement().getStyle().set("width", "100%");
		 getElement().getStyle().set("height", "100%");
		 getElement().getStyle().set("padding", "10px");
		 getElement().getStyle().set("margin", "0px");
		 getElement().setProperty("placeholder", "Escribe la descripción del anuncio");
		 getElement().setProperty("type", "text");
	}
	
	public String getText() {
		return getElement().getText();
	}
	
}