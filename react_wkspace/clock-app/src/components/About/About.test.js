import React from 'react';
import { shallow, render, mount } from 'enzyme';
import About from './About';

describe('About', () => {
  let props;
  let shallowAbout;
  let renderedAbout;
  let mountedAbout;

  const shallowTestComponent = () => {
    if (!shallowAbout) {
      shallowAbout = shallow(<About {...props} />);
    }
    return shallowAbout;
  };

  const renderTestComponent = () => {
    if (!renderedAbout) {
      renderedAbout = render(<About {...props} />);
    }
    return renderedAbout;
  };

  const mountTestComponent = () => {
    if (!mountedAbout) {
      mountedAbout = mount(<About {...props} />);
    }
    return mountedAbout;
  };  

  beforeEach(() => {
    props = {};
    shallowAbout = undefined;
    renderedAbout = undefined;
    mountedAbout = undefined;
  });

  // Shallow / unit tests begin here
 
  // Render / mount / integration tests begin here
  
});
