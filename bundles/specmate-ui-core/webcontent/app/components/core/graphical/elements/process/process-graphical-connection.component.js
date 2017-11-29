"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var ProcessConnection_1 = require("../../../../../model/ProcessConnection");
var graphical_connection_base_1 = require("../graphical-connection-base");
var selected_element_service_1 = require("../../../../../services/editor/selected-element.service");
var ProcessGraphicalConnection = (function (_super) {
    __extends(ProcessGraphicalConnection, _super);
    function ProcessGraphicalConnection(selectedElementService) {
        var _this = _super.call(this, selectedElementService) || this;
        _this.nodeType = ProcessConnection_1.ProcessConnection;
        return _this;
    }
    Object.defineProperty(ProcessGraphicalConnection.prototype, "showCondition", {
        get: function () {
            return this.connection && this.connection.condition && this.connection.condition.length > 0;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ProcessGraphicalConnection.prototype, "conditionText", {
        get: function () {
            if (this.showCondition) {
                return '[' + this.connection.condition + ']';
            }
            return '';
        },
        enumerable: true,
        configurable: true
    });
    ProcessGraphicalConnection = __decorate([
        core_1.Component({
            moduleId: module.id,
            selector: '[process-graphical-connection]',
            templateUrl: 'process-graphical-connection.component.svg',
            styleUrls: ['process-graphical-connection.component.css']
        }),
        __metadata("design:paramtypes", [selected_element_service_1.SelectedElementService])
    ], ProcessGraphicalConnection);
    return ProcessGraphicalConnection;
}(graphical_connection_base_1.GraphicalConnectionBase));
exports.ProcessGraphicalConnection = ProcessGraphicalConnection;
//# sourceMappingURL=process-graphical-connection.component.js.map