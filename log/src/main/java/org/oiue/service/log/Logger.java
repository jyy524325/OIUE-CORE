package org.oiue.service.log;

import java.io.Serializable;

public interface Logger  extends Serializable{

	public boolean isTraceEnabled();

	public void trace(String msg);

	public void trace(String msg, Throwable t);

	public boolean isDebugEnabled();

	public void debug(String msg);

	public void debug(String msg, Throwable t);

	public boolean isInfoEnabled();

	public void info(String msg);

	public void info(String msg, Throwable t);

	public boolean isWarnEnabled();

	public void warn(String msg);

	public void warn(String msg, Throwable t);

	public boolean isErrorEnabled();

	public void error(String msg);

	public void error(String msg, Throwable t);

}
