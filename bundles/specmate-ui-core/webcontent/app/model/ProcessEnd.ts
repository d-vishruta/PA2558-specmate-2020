	import './support/gentypes';
	import { Proxy } from './support/proxy';

	export class ProcessEnd  {

		___nsuri: string = "http://specmate.com/20170409/model/processes";
		public url: string;
		public className: string = "ProcessEnd";
		public static className: string = "ProcessEnd";

		// Attributes
		public id: EString;
		public name: EString;
		public description: EString;
		public x: EDouble;
		public y: EDouble;

		// References
		
		public outgoingConnections: Proxy[];
		public incomingConnections: Proxy[];


	}
