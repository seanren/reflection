package xren.reflection.classscanner;

import java.util.List;

public interface Scanner  {
	
	public <T> List <Class <? extends T> > findSubClass(Class<T> type);

}
