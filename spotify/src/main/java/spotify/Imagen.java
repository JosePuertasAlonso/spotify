package spotify;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;

@Tag("img")
public class Imagen extends Component implements HasSize {

   public Imagen() {
   }

   public Imagen(String src) {
      setSrc(src);
      getElement().getStyle().set("padding", "0px");
      getElement().getStyle().set("margin", "0px");
      getElement().getStyle().set("width", "100%");
      getElement().getStyle().set("height", "100%");
   }

   public void setSrc(String src) {
      getElement().setProperty("src", src);
   }
   
   public void setMaxWidth(String w) {
	   getElement().getStyle().set("max-width", w);
   }
   
   public void setWidth(String w) {
	   getElement().getStyle().set("width", w);
   }
   
   public void setMaxHeight(String h) {
	   getElement().getStyle().set("max-height", h);
   }
   
   
   public void setHeight(String h) {
	   getElement().getStyle().set("height", h);
   }
   
   
   public void setRadius(String r) {
	   getElement().getStyle().set("border-radius", r);
   }
   
  
}
