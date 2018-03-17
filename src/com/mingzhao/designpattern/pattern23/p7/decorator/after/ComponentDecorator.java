package com.mingzhao.designpattern.pattern23.p7.decorator.after;

/**
 * Created by SEELE on 2018/3/14.
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component){
        this.component = component;
    }
    @Override
    public void display() {
        component.display();
    }
}
