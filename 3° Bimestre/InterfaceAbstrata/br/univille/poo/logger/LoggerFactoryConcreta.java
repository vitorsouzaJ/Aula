package br.univille.poo.logger;

 class LoggerFactoryConcreta extends LoggerFactory {

	@Override
	public Logger createConsoleLogger() {
		
		return  new ConsoleLogger();
	}

	@Override
	public Logger createFileLogger() {
		
		return new FileLogger();
	}

}
